package kz.bitlab.middle02.middle02main_sevice.mappet;

import kz.bitlab.middle02.middle02main_sevice.dto.ItemDto;
import kz.bitlab.middle02.middle02main_sevice.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")

public interface ItemMapper {
    @Mapping(source = "amount", target = "itemAmount")
    @Mapping(source = "price", target = "itemPrice")
    ItemDto toDto(Item item);

    @Mapping(source = "itemAmount", target = "amount")
    @Mapping(source = "itemPrice", target = "price")
    Item toEntity(ItemDto itemDto);

    List<ItemDto> toDtoList(List<Item> items);
}
