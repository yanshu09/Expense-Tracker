package com.expensetracker.expense_tracker.services.income;

import com.expensetracker.expense_tracker.dto.IncomeDTO;
import com.expensetracker.expense_tracker.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);

    List<IncomeDTO> getAllIncomes();

    Income updateIncome(Long id, IncomeDTO incomeDTO);

    IncomeDTO getIncomeById(Long id);

    void deleteIncome(Long id);
}
