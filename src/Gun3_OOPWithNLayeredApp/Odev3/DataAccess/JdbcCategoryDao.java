package Gun3_OOPWithNLayeredApp.Odev3.DataAccess;

import Gun3_OOPWithNLayeredApp.Odev3.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements ICategoryDao{
    private List<Category> categories = new ArrayList<Category>();


    @Override
    public List<Category> getAllCategories() {
        System.out.println("Kategoriler JDBC ile getirildi");
        return categories;
    }

    @Override
    public Category getCategory(int id) throws Exception {
        for (Category category : categories){
            if (category.getId() == id){
                System.out.println(id+ " numaralı kategori JDBC ile getirildi");
                return category;
            }else {
                System.out.println("Kategori bulunamadı");
            }
        }
        throw new Exception("Hata");
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("JDBC ile "+category.name+" isimli kategori eklendi");
        this.categories.add(category);
    }

    @Override
    public void updateCategory(Category category) {
        System.out.println("Kategori Güncellendi(JDBC)");
    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println("Kategori Silindi(JDBC)");
    }
}
