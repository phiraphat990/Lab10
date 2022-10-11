package com.example.productserver.command;


import lombok.Builder;
import lombok.Data;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;
import java.security.SecureRandom;

@Builder
@Data
public class CreateProductCommand {
    @TargetAggregateIdentifier
    private final String productId;
    private final String title;
    private final BigDecimal price;
    private final Integer quantity;
}
