package bera31.Project.api.controller;

import bera31.Project.domain.dto.requestdto.DutchPayRequestDto;
import bera31.Project.domain.dto.responsedto.DutchPayListResponseDto;
import bera31.Project.domain.dto.responsedto.DutchPayResponseDto;
import bera31.Project.service.page.DutchPayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DutchPayController {
    private final DutchPayService dutchPayService;

    @GetMapping("/api/dutchPay")
    public List<DutchPayListResponseDto> findAll() {
        return dutchPayService.findAllDutchPay();
    }

    @PostMapping("/api/dutchPay")
    public Long postDutchPay(@RequestBody DutchPayRequestDto dutchPayRequestDto) {
        return dutchPayService.postDutchPay(dutchPayRequestDto);
    }

    @DeleteMapping("/api/dutchPay/{dutchPayId}")
    public void deleteDutchPay(@PathVariable Long dutchPayId) {
        dutchPayService.deleteDutchPay(dutchPayId);
        return;
    }

    @GetMapping("/api/dutchPay/{dutchPayId}")
    public DutchPayResponseDto findDutchPay(@PathVariable Long dutchPayId){
        return dutchPayService.findDutchPay(dutchPayId);
    }

}
