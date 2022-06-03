package com.csrlnd.LibraryAPI.Repositories;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.csrlnd.LibraryAPI.Model.Book;
import com.csrlnd.LibraryAPI.Model.Library;

public interface LibraryRepository extends MongoRepository<Library,String> {

;
}