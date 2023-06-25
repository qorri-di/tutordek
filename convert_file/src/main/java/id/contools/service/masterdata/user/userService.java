package id.contools.service.masterdata.user;

import id.contools.common.helpers.GenericResponseDTO;
import id.contools.dto.masterdata.user.userRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class userService {

    public GenericResponseDTO<?> saveUser(userRequest request){
        if (request.getUserId() == null){
            return createUser(request);
        } else {
            return updateUser(request);
        }
    }

    private GenericResponseDTO<?> createUser(userRequest request){
        GenericResponseDTO<?> responseDTO = new GenericResponseDTO<>();

        return responseDTO.successResponse(null,"");
    }

    private GenericResponseDTO<?> updateUser(userRequest request){
        GenericResponseDTO<?> responseDTO = new GenericResponseDTO<>();
        return responseDTO.successResponse(null,"");
    }
}
