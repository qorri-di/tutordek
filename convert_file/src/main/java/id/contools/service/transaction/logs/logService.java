package id.contools.service.transaction.logs;

import id.contools.common.helpers.GenericResponseDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class logService {
    public GenericResponseDTO<?> setActivityLogs(){
        GenericResponseDTO<?> responseDTO = new GenericResponseDTO<>();
        return responseDTO.successResponse(null,"");
    }

    public GenericResponseDTO<?> setFeatureLogs(){
        GenericResponseDTO<?> responseDTO = new GenericResponseDTO<>();
        return responseDTO.successResponse(null,"");
    }

    public GenericResponseDTO<?> setBannedIP(){
        GenericResponseDTO<?> responseDTO = new GenericResponseDTO<>();
        return responseDTO.successResponse(null,"");
    }
}
