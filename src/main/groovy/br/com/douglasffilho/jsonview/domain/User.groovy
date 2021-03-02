package br.com.douglasffilho.jsonview.domain

import br.com.douglasffilho.jsonview.views.Views
import com.fasterxml.jackson.annotation.JsonView

class User {
    @JsonView(Views.Public)
    String name

    String field

    @JsonView(Views.Internal)
    String password
}
