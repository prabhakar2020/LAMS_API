package com.rackspace.hr.management.controller.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import com.rackspace.hr.management.controller.LeaveDataController;
import com.rackspace.hr.management.dto.LeaveDataDTO;

@RestController
public class LeaveDataControllerImpl implements LeaveDataController{

    @Override
    public LeaveDataDTO createLeaveData(@Valid LeaveDataDTO body) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<LeaveDataDTO> getAllLeaveData() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LeaveDataDTO getLeaveDataById(String leaveDataId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LeaveDataDTO updateLeaveData(String leaveDataId, @Valid LeaveDataDTO body) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deleteLeaveData(String leaveDataId) {
        // TODO Auto-generated method stub
        return null;
    }

}
