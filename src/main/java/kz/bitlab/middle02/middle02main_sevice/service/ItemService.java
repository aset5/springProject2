package kz.bitlab.middle02.middle02main_sevice.service;

import kz.bitlab.middle02.middle02main_sevice.dto.ItemDto;
import kz.bitlab.middle02.middle02main_sevice.mappet.ItemMapper;
import kz.bitlab.middle02.middle02main_sevice.model.Item;
import kz.bitlab.middle02.middle02main_sevice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    public List<ItemDto> getItems() {
        return itemMapper.toDtoList(itemRepository.findAll());
    }

    public ItemDto getItem(Long id) {
        return itemMapper
                .toDto(itemRepository.findById(id).orElse(null));
    }

    public ItemDto addItem(ItemDto itemDto) {
        return itemMapper.toDto(itemRepository.save(itemMapper.toEntity(itemDto)));
    }

    public ItemDto updateItem(ItemDto itemDto) {
        return itemMapper.toDto(itemRepository.save(itemMapper.toEntity(itemDto)));
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

}


