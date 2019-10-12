package example.service;

import com.google.gson.Gson;
import example.entity.Place;
import example.util.HibernateUtility;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class PlaceService {

    @WebMethod
    public List<Place> getAll() {
        List<Place> placeList = HibernateUtility.getSession().createQuery("from Place", Place.class).list();
        for (Place place :
                placeList) {
            System.out.println(place.getId() + " - " + place.getName() + " - " + place.getCity().getName());
        }
        System.out.println(new Gson().toJson(placeList));
        return HibernateUtility.getSession().createQuery("from Place", Place.class).list();
    }
}
