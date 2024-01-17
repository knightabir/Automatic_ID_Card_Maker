package com.IdCard.service;

import com.IdCard.entity.SchoolUser;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class SchoolUserServiceImpl implements SchoolUserService{
    @Override
    public void flush() {

    }

    @Override
    public <S extends SchoolUser> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends SchoolUser> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<SchoolUser> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SchoolUser getOne(Long aLong) {
        return null;
    }

    @Override
    public SchoolUser getById(Long aLong) {
        return null;
    }

    @Override
    public SchoolUser getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends SchoolUser> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SchoolUser> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SchoolUser> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SchoolUser> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SchoolUser> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SchoolUser> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends SchoolUser, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends SchoolUser> S save(S entity) {
        return null;
    }

    @Override
    public <S extends SchoolUser> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<SchoolUser> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<SchoolUser> findAll() {
        return null;
    }

    @Override
    public List<SchoolUser> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(SchoolUser entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends SchoolUser> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<SchoolUser> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<SchoolUser> findAll(Pageable pageable) {
        return null;
    }

}
