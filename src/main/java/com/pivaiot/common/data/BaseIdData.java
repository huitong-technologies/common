package com.pivaiot.common.data;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseIdData implements BaseData {
    private Long id;
}
