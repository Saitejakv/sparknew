import static spark.Spark.get;

public class Main2 {
	 public static void main(String[] args) {
		 get("/say/*/to/*", (request, response) -> {
			    return "Number of splat parameters: " + request.splat().length;
			});
	    }
	}

