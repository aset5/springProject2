package kz.bitlab.middle02.middle02main_sevice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private long id;

    private String name;

    private double itemPrice;

    private int itemAmount;



}
