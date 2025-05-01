package dto;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;


public record CurrencyDto(
        @Setter
        @Getter
        String baseCode,

         Map<String, Double> conversionRates
) {}
