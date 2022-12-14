package kodlama.io.RentACar.webApi.contollers;

import kodlama.io.RentACar.business.abstracts.BrandService;
import kodlama.io.RentACar.business.requests.CreateBrandRequest;
import kodlama.io.RentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.RentACar.entities.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsContoller {
    private BrandService brandService;

    public BrandsContoller(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
}
