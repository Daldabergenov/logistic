package kz.srcadb.logistic.controller;

import kz.srcadb.logistic.domain.Mark;
import kz.srcadb.logistic.repo.MarkRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mark")
public class MarkRestController extends AbstractRestController<Mark, MarkRepo> {
    public MarkRestController(MarkRepo repo) {
        super(repo);
    }
}