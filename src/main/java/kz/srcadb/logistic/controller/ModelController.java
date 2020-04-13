package kz.srcadb.logistic.controller;

import kz.srcadb.logistic.domain.Model;
import kz.srcadb.logistic.repo.ModelRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepo> {
    public ModelController(ModelRepo repo) {
        super(repo);
    }
}