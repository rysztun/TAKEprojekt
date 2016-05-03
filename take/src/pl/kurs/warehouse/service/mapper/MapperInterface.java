package pl.kurs.warehouse.service.mapper;

/**
 * Created by Sebastian on 2016-05-02.
 */
public interface MapperInterface<DBO, DTO> {

    DBO convertToDBO(DTO dto);

    DTO convertToDTO(DBO dbo);

    Iterable<DBO> convertToDBO(Iterable<DTO> dto);

    Iterable<DTO> convertToDTO(Iterable<DBO> dbo);
}
