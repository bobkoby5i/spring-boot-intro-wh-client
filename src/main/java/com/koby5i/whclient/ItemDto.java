package com.koby5i.whclient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto implements Serializable {

    private Long id;
    private String name;
    private String description;
    private int qty;
    private BigDecimal price;
    private String createdAt;
    private String updatedAt;

}
