package pl.boniaszczuk.weekop.dao;

import pl.boniaszczuk.weekop.model.Discovery;

import java.util.List;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long>{

    List<Discovery> getAll();

}
