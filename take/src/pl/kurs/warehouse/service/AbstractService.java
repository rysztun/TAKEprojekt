package pl.kurs.warehouse.service;

import pl.kurs.warehouse.repo.AbstractRepo;
import pl.kurs.warehouse.service.mapper.MapperInterface;

import javax.ejb.EJB;

/**
 * Created by Sebastian on 2016-05-02.
 */
abstract public class AbstractService<DBO, DTO, R extends AbstractRepo<DBO,Long>, M extends MapperInterface<DBO, DTO>> {

    @EJB
    R repo;
    @EJB
    M mapper;

    public DTO findOne(Long id) {
        DBO dbo = repo.findById(id);
        if(dbo != null){
            return  mapper.convertToDTO(dbo);
        }
        return null;
    }

    public void save(DTO modelToSave) {repo.save(mapper.convertToDBO(modelToSave));}

    public void save(Iterable<DTO> modelsToSave) {repo.save(mapper.convertToDBO(modelsToSave));}

    public void delete(DTO modelToDelete) {repo.delete(mapper.convertToDBO(modelToDelete));}

    public void delete(Iterable<DTO> modelsToDelete) {repo.delete(mapper.convertToDBO(modelsToDelete));}

    public void update(DTO modelToUpdate) {repo.update(mapper.convertToDBO(modelToUpdate));}

    //gdybym potrzebowal w kontrolerze
    public M getMapper() {return mapper;}
}
