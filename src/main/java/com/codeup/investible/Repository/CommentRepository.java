package com.codeup.investible.Repository;

import com.codeup.investible.Models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
