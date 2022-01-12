package ca.nait.dmit.service;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AlbertaCovid19DataReaderServiceTest {
    @Test
    void shouldContainNRecords() throws IOException {
        AlbertaCovid19DataReaderService dataService = new AlbertaCovid19DataReaderService();
        assertEquals(676, dataService.getDataList().size());
    }
}