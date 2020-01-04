package net.c7j.weather.geomagnetic.dao.access;

import net.c7j.weather.geomagnetic.model.dto.ForecastDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

public interface ForecastAccessService {

    void save(Collection<ForecastDto> forecasts);

    Set<ForecastDto> findDiurnal(LocalDate today);

    Set<ForecastDto> findCurrent(LocalDateTime today);

    Set<ForecastDto> findThreeDays(LocalDate today);

}