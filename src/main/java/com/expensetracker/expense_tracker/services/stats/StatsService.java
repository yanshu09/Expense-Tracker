package com.expensetracker.expense_tracker.services.stats;

import com.expensetracker.expense_tracker.dto.GraphDTO;
import com.expensetracker.expense_tracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartDate();

    StatsDTO getStats();
}
