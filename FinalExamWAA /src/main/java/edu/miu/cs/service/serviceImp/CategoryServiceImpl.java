package edu.miu.cs.service.serviceImp;

import edu.miu.cs.Repository.CategoryRepo;

import edu.miu.cs.model.Category;
import edu.miu.cs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    private CategoryRepo categoryRepo;


    @Override
    public Category save(Category category) {
        return categoryRepo.save(category);
    }
}
