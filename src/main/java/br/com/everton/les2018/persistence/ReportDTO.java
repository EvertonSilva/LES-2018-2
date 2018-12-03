package br.com.everton.les2018.persistence;

import java.util.Date;

public interface ReportDTO {
    int getTotal();
    Date getLoanDate();
    String getTitle();
}
