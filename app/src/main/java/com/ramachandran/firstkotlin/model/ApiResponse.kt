package com.ramachandran.firstkotlin.model

data class Repos(val id: Long,
                 val node_id : String,
                 val name : String,
                 val full_name : String,
                 val private : Boolean,
                 val owner : Owner,
                 val default_branch : String,
                 val description : String) {
}
data class Owner(val login :String,
                 val id : Long,
                 val node_id : String,
                 val url : String,
                 val html_url : String,
                 val organizations_url :  String,
                 val type :String,
                 val site_admin : Boolean){

}