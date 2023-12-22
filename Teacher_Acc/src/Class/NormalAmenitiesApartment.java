package Class;

	
class NormalAmenitiesApartment extends Apartment 
{
	    private boolean hasLaundry;

	    
	    public NormalAmenitiesApartment(String roomNumber, int numberOfBeds, double rent, double size, Teacher teacher, boolean hasLaundry) {
	        super(roomNumber, numberOfBeds, rent, size, teacher);
	        this.hasLaundry = hasLaundry;
	    }


}
