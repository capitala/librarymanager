package com.practice.projects.librarymanagement.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.practice.projects.librarymanagement.entity.BookDetail;
import com.practice.projects.librarymanagement.entity.MemberDetail;
import com.practice.projects.librarymanagement.service.LibraryService;
import com.practice.projects.librarymanagement.utility.BookForm;
import com.practice.projects.librarymanagement.utility.MemberForm;

@RunWith(SpringRunner.class)
@WebMvcTest(LibraryController.class)
public class LibraryControllerTest {
@MockBean
private LibraryService service;
@Autowired
private MockMvc mockMvc;
@Test
public void getAvailableBooksTest() throws Exception {
	Mockito.when(service.getAvailableBooks()).thenReturn(new ArrayList<BookDetail>());
	mockMvc.perform(get("/getAvailableBooks"))
	.andExpect(status().isOk());
}
@Test
public void getBooksByGenreTest() throws Exception {
	Mockito.when(service.getBooksByGenre(Mockito.anyString())).thenReturn(new ArrayList<BookDetail>());
	mockMvc.perform(get("/getBooksByGenre"))
	.andExpect(status().isOk());
}
@Test
public void searchBookTest() throws Exception {
	Mockito.when(service.searchBook(Mockito.isA(BookForm.class))).thenReturn(new ArrayList<BookDetail>());
	mockMvc.perform(get("/searchBook"))
	.andExpect(status().isOk());
}
@Test
public void getMemberInfoTest() throws Exception {
	Mockito.when(service.getMemberInfo(Mockito.isA(MemberForm.class))).thenReturn(new ArrayList<MemberDetail>());
	mockMvc.perform(get("/getMemberInfo"))
	.andExpect(status().isOk());
}
}
