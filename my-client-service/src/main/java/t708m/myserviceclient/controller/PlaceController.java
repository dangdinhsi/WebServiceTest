package t708m.myserviceclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t708m.myserviceclient.service.place.PlaceService;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/place")
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public String index(Model model) throws RemoteException {
        model.addAttribute("list", placeService.getAll());
        return "place/list";
    }

}
