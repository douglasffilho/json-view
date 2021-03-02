package br.com.douglasffilho.jsonview.controller

import br.com.douglasffilho.jsonview.domain.User
import br.com.douglasffilho.jsonview.views.Views
import com.fasterxml.jackson.annotation.JsonView
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/')
class UserController {

    @PostMapping('/internal')
    @JsonView(Views.Internal)
    ResponseEntity<User> viewInternal(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.OK).body(user)
    }

    @PostMapping('/public')
    @JsonView(Views.Public)
    ResponseEntity<User> viewPublic(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.OK).body(user)
    }
}
