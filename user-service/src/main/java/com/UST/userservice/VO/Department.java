package com.UST.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private long departmentId;
    private String departmentname;
    private String departmentAddress;
    private String departmentCode;

}
