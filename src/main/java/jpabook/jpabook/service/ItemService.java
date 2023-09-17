package jpabook.jpabook.service;

import jpabook.jpabook.domain.*;
import jpabook.jpabook.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item){
        itemRepository.save(item);
    }

    @Transactional
    public Item updateItem(Long itemId, UpdateItemDto){
        Item findItem = itemRepository.findOne(itemId);
        findItem.setPrice(name);
        findItem.setName(price);
        findItem.setStockQuantity(stockQuantity);
        return findItem;
    }

    public List<Item> findItems(){
        return itemRepository.finaAll();
    }

    public Item findOne(Long itemid){
        return itemRepository.findOne(itemid);
    }





}
