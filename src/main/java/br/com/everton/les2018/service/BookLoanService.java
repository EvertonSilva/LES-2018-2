package br.com.everton.les2018.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import br.com.everton.les2018.persistence.ReportDTO;
import br.com.everton.les2018.persistence.repository.BookLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.BookReturn;
import br.com.everton.les2018.model.ExemplarStatus;
import br.com.everton.les2018.persistence.repository.BookReturnRepository;
import br.com.everton.les2018.persistence.repository.ExemplarRepository;

@Transactional
@Service
public class BookLoanService extends CrudService<BookLoan> {

	@Autowired
	private ExemplarRepository exemplarRepo;
	
	@Autowired
	private BookReturnRepository bookReturnRepo;
	
	public BookLoanService() {
		super.entityName = "bookloan";
	}
	
	@Override
	public BookLoan saveEntity(BookLoan entity) {
		entity.getExemplarList().forEach(e -> {
			e.setStatus(ExemplarStatus.UNAVAILABLE);
			exemplarRepo.saveAndFlush(e);
		});
		return super.saveEntity(entity);
	}
	
	@Override
	public List<BookLoan> searchBy(String filter) {
		return Collections.emptyList();
	}

	@Transactional
	public BookLoan returnBook(Long loanId, @Valid BookReturn bookReturn) {
		BookLoan loan = super.getEntity(loanId).get();
		bookReturn = bookReturnRepo.saveAndFlush(bookReturn);
		
		loan.addBookReturn(bookReturn);

		super.context = "RETURN";
		super.executeRules(loan);

		loan = super.updateEntity(loan);
		return loan;
	}

	public List<ReportDTO> loanByBookPerPeriod(String startDate, String endDate) {
		return ((BookLoanRepository) repo).loansByBookPerPeriod(
				dateToString(startDate),
				dateToString(endDate)
		);
	}

	private Date dateToString(String dateStr) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return fmt.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return new Date();
	}

}
