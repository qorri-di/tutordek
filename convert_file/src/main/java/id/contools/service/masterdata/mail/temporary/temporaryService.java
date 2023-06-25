package id.contools.service.masterdata.mail.temporary;

import id.contools.common.helpers.GenericResponseDTO;
import id.contools.domain.masterdata.mstMailTemp;
import id.contools.dto.masterdata.mail.temporary.temporaryRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.Optional;

import static id.contools.common.helpers.Constants.mailBlacklist;

@ApplicationScoped
@Transactional
public class temporaryService {

    public GenericResponseDTO<?> saveTemp(temporaryRequest request){
        if (request.getTempId() == null){
            return createTemp(request);
        } else {
            return updateTemp(request);
        }
    }

    private GenericResponseDTO<?> createTemp(temporaryRequest request){
        long start = System.currentTimeMillis();
        System.out.println(String.format("[[ %s ]]-------------------- createTemp: START --------------------",request.getMailTemp()));

        GenericResponseDTO<?> responseDTO = new GenericResponseDTO<>();
        Optional<mstMailTemp> mailTemp = mstMailTemp.find("mailTempName=?1",request.getMailTemp()).firstResultOptional();
        if (!mailTemp.isPresent()){
            // email telah di blacklist
            return responseDTO.errorResponse(204, mailBlacklist);
        }

        long stop = System.currentTimeMillis();
        System.out.println(String.format("[[ %s ]]-------------------- createTemp: RESULT [[ %s ]] --------------------",request.getMailTemp(), null));
        System.out.println(String.format("[[ %s ]]-------------------- createTemp: END %s ms --------------------",request.getMailTemp(),(stop-start)));
        return responseDTO.successResponse(null,"");
    }

    private GenericResponseDTO<?> updateTemp(temporaryRequest request){
        GenericResponseDTO<?> responseDTO = new GenericResponseDTO<>();
        return responseDTO.successResponse(null,"");
    }
}
