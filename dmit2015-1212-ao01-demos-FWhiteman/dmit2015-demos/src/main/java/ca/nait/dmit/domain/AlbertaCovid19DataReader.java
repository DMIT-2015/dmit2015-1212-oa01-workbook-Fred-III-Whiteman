package ca.nait.dmit.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AlbertaCovid19DataReader {
    // Define data field for each column in the CVS file
    // 0 - ID
    // 1 - date reported
    // 2 - number of lab tests
    // 3 - Cumulative number of lab tests
    // 4 - Number of cases
    // 5 - Cumulative number of cases
    // 6 - Active cases
    // 7 - Currently hospitalized
    // 8 - Currently in ICU
    // 9 - Cumulative number of deaths
    // 10 - Number of deaths
    // 11 - Number of variants of concern
    // 12 - Percent positivity
    private int id; // This could be ignored in this case
    private LocalDate dateReported;
    private int NumberOfLabTests;
    private int cumulativeNumberOfLabTests;
    private int numberOfCases;
    private int cumulativeNumberOfCases;
    private int activeCases;
    private int currentlyHospitalized;
    private int currentlyInICU;
    private int cumulativeNumberOfDeaths;
    private int numberOfDeaths;
    private int numberOfVariantsOfConcern;
    private double percentPositivity;
}
