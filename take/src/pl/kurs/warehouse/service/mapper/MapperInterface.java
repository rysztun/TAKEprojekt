package pl.kurs.warehouse.service.mapper;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-02.
 */

public interface MapperInterface<DBO, DTO> {

    DBO convertToDBO(DTO dto);

    DTO convertToDTO(DBO dbo);

    List<DBO> convertToDBO(Iterable<DTO> dto);

    List<DTO> convertToDTO(Iterable<DBO> dbo);
}
