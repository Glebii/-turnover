package com.example.appliances.api;


import com.example.appliances.model.request.FilialRequest;
import com.example.appliances.model.response.FilialResponse;
import com.example.appliances.service.FilialService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RestController
@RequestMapping("/organizations")
public class FilialApi {
    FilialService organizationsService;

    @Autowired
    public FilialApi(FilialService organizationsService) {
        this.organizationsService = organizationsService;
    }


    @GetMapping("/getAllUserOrganizations")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<FilialResponse>> getAllUserOrganizations(@RequestParam String pin, @RequestParam String password) {
        List<FilialResponse> userOrganizationModel = organizationsService.getAllUserOrganizations(pin, password);
        return new ResponseEntity<>(userOrganizationModel, HttpStatus.OK);
    }

    @PostMapping()
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<FilialResponse> saveOrganization(@Valid @RequestBody FilialRequest organizationModel) {
        FilialResponse save = organizationsService.saveOrganization(organizationModel);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @GetMapping("/getAllOrganization")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Page<FilialResponse> findAllBySpecification(@RequestParam(required = false, defaultValue = "0") int page,
                                                  @RequestParam(required = false, defaultValue = "25") int size,
                                                  @RequestParam(required = false) Optional<Boolean> sortOrder,
                                                  @RequestParam(required = false) String sortBy) {
        return organizationsService.getAllOrganizations(page, size, sortOrder, sortBy);
    }
    @GetMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<FilialResponse> getOrganizationById(@PathVariable Long id) {
        FilialResponse organizationById = organizationsService.getOrganizationById(id);
        return new ResponseEntity<>(organizationById, HttpStatus.OK);
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<FilialResponse> updateOrganization(@Valid @RequestBody FilialRequest organizationModel, @PathVariable Long id) {
        FilialResponse update = organizationsService.updateOrganization(organizationModel, id);
        return new ResponseEntity<>(update, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void deleteOrganization(@PathVariable Long id) {
        organizationsService.deleteOrganizationById(id);
    }
}
