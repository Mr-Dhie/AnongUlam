package ulam;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UlamService {
	
	private final UlamRepository ulamRepo;
	
	UlamService(UlamRepository repo){
		ulamRepo = repo;
	}
	
	
	public List<Ulam> kuninLahatUlam(){
		return ulamRepo.findAll();
	}
	
	public void dagdag(Ulam ulam){
		ulamRepo.save(ulam);
	}
	
	public void tangalin(Integer id){
		ulamRepo.deleteById(id);
	}
	

}
