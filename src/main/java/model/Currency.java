package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;


@Data
@AllArgsConstructor
public class Currency {

    @SerializedName("base_code")
    public String currencyName;
    @SerializedName("conversion_rates")
    public Map<String, Double >conversionRates;

}
