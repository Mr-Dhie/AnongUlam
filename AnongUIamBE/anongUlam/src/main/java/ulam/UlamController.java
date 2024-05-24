package ulam;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ulam")
public class UlamController {
	
	private final UlamService waiter;
	
	
	UlamController(UlamService waiter){
		this.waiter = waiter;
	}
	
	@GetMapping("/")
	public List<Ulam> getAll(){
		return waiter.kuninLahatUlam();
	}
	
	@PostMapping("/add")
	public void addUlam(@RequestBody Ulam ulam){
		waiter.dagdag(ulam);
	}
	
	@DeleteMapping("/delete")
	public void deleteUlam(@PathVariable Integer id){
		waiter.tangalin(id);
	}

}
