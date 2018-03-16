package com.practice.projects.librarymanagement.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.projects.librarymanagement.entity.BookDetail;
import com.practice.projects.librarymanagement.entity.MemberDetail;
import com.practice.projects.librarymanagement.utility.BookForm;
import com.practice.projects.librarymanagement.utility.MemberForm;

@RestController
public class LibraryController {
@RequestMapping("/getAvailableBooks")
public List<BookDetail> getAvailableBooks(){
	return null;
}
@RequestMapping("/getBooksByGenre")
public List<BookDetail> getBooksByGenre(@RequestParam("genre") String genre){
	return null;
}
@RequestMapping("/searchBook")
public List<BookDetail> searchBook(BookForm bookForm){
	return null;
}
@RequestMapping("/getMemberInfo")
public List<MemberDetail> getMemberInfo(MemberForm memberForm){
	return null;
}
@RequestMapping("/borrowABook")
public BookDetail borrowABook(@RequestParam("id") long id ){
	return null;
}
@RequestMapping("/addABook")
public ResponseEntity<Object> addABook(@RequestBody BookDetail book){
	return null;
}
}
