package com.company;

import com.company.models.Item;
import com.company.services.ItemService;
import com.company.stores.ItemStore;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class ItemServiceTest {

  @Mock
  private ItemStore itemStore;

  @InjectMocks
  private ItemService itemService;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void getItemNameUpperCase() {

    //
    // Given
    //
    Item mockedItem = new Item(22L, "Item 1", "This is item 1", 2000);
    when(itemStore.findById(22L)).thenReturn(mockedItem);

    //
    // When
    //
    String result = itemService.getItemNameUpperCase(22L);

    //
    // Then
    //
    verify(itemStore, times(1)).findById(22L);
    assertThat(result, is("ITEM 1"));
  }
}
