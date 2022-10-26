package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // Bu sinif bir business nesnesidir.
public class BrandManager implements BrandService {
	private BrandRepository bradBrandRepository;
	
	@Autowired
	public BrandManager(BrandRepository bradBrandRepository) {
		super();
		this.bradBrandRepository = bradBrandRepository;
	}

	@Override
	public List<Brand> getAll() {

		return bradBrandRepository.getAll();
	}

}
