package com.kodzamani.libraryprojectwithdb.controller;

import com.kodzamani.libraryprojectwithdb.AbstractTest;
import com.kodzamani.libraryprojectwithdb.dataBaseVariables.Books;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BooksControllerTest  extends AbstractTest {
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }
    @Test
    public void getAllBooks() throws Exception {
        String uri = "/";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Books[] bList = super.mapFromJson(content, Books[].class);
        assertTrue(bList.length > 0);
    }

    @Test
    public void createProduct() throws Exception {
        String uri = "/save";
        Books bk = new Books();
        bk.setID(1);
        bk.setBookName("Chess");
        bk.setBookAuthorName("Stefan Zweig");
        bk.setBookSerialNumber("1590171691");
        bk.setPublisher("Can Yayinlari");

        String inputJson = super.mapToJson(bk);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Product is created successfully");
    }

    @Test
    public void updateProduct() throws Exception {
        String uri = "/save/3";
        Books bk = new Books();
        bk.setBookName("Olasılıksız");
        String inputJson = super.mapToJson(bk);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Product is updated successsfully");
    }
    @Test
    public void deleteProduct() throws Exception {
        String uri = "/save/5";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Product is deleted successsfully");
    }
}
