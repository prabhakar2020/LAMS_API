package com.rackspace.hr.management.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rackspace.hr.management.dto.LeaveDataDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = { "LeaveData" }, description = "Operations related to Leave Data for Employee")
@RequestMapping("/leave")
public interface LeaveDataController {

    @ApiOperation(value = "Saves Leave Data for the employee.", nickname = "createLeaveData", notes = "Saves Leave Data for the employee.", response = LeaveDataDTO.class, tags = {})
    @RequestMapping(produces = { "application/json" }, consumes = { "application/json" },  method = RequestMethod.POST)
    LeaveDataDTO createLeaveData(
            @ApiParam(value = "LeaveData to be added to db store.", required = true) @Valid @RequestBody LeaveDataDTO body);

    @ApiOperation(value = "Gets All Leave Data for the Employee", nickname = "getAllLeaveData", notes = "Gets All Leave Data for the Employee", response = LeaveDataDTO.class, responseContainer = "List", tags = {})
    @RequestMapping(produces = { "application/json" }, method = RequestMethod.GET)
    List<LeaveDataDTO> getAllLeaveData();

    @ApiOperation(value = "Get specific Leave Data for the Employee", nickname = "getLeaveData", notes = "Gets Leave Data for the Employee", response = LeaveDataDTO.class, tags = {})
    @RequestMapping(value = "/{leaveDataId}", produces = { "application/json" }, method = RequestMethod.GET)
    LeaveDataDTO getLeaveDataById(@ApiParam(value = "", required = true) @PathVariable("leaveDataId") String leaveDataId);

    @ApiOperation(value = "Update Leave Data object.", nickname = "updateLeaveData", notes = "Updates Leave Data object.", response = LeaveDataDTO.class, tags = {})
    @RequestMapping(value = "/{leaveDataId}", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.PUT)
    LeaveDataDTO updateLeaveData(@ApiParam(value = "", required = true) @PathVariable("leaveDataId") String leaveDataId,
            @ApiParam(value = "Leave Data details to be updated to db store.", required = true) @Valid @RequestBody LeaveDataDTO body);
    
    @ApiOperation(value = "Deletes specific Leave Data for the Employee", nickname = "deleteLeaveData", notes = "Deletes Leave Data.", response = String.class, tags = {})
    @RequestMapping(value = "/{leaveDataId}", method = RequestMethod.DELETE)
    String deleteLeaveData(@ApiParam(value = "", required = true) @PathVariable("leaveDataId") String leaveDataId);

}
