package net.c7j.weather.geomagnetic.model.dto;

import lombok.Data;
import lombok.NonNull;
import net.c7j.weather.geomagnetic.model.base.IndexType;
import net.c7j.weather.geomagnetic.util.JsonWriter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class ForecastDto implements Comparable<ForecastDto> {

    private Long id;

    private IndexType index;

    private LocalTime forecastTime;

    private LocalDate forecastDate;

    public ForecastDto updateIndex(IndexType index) {
        setIndex(index);
        return this;
    }

    @Override
    public int compareTo(@NonNull ForecastDto that) {
        var thisDateTime = LocalDateTime.of(this.forecastDate, this.forecastTime);
        var thatDateTime = LocalDateTime.of(that.forecastDate, that.forecastTime);
        return thisDateTime.compareTo(thatDateTime);
    }

    @Override
    public String toString() {
        return JsonWriter.toStringAsJson(this);
    }
}