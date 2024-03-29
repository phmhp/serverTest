package solux.baco.service.RouteModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteDTO {
    //응답받은 정보에서 필요한 정보만 정의.

    private int code;

    public int getCode() {
        return code;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    private String currentDateTime;

    public String getCurrentDateTime() {
        return currentDateTime;
    }


    private RouteUnitEnt route;

    public RouteUnitEnt getRoute() {
        return route;
    }

}

