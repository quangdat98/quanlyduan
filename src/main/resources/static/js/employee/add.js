$(document).ready(function(){
    $("#inlineFormCheck").change(function(){
        $('#full').val("");
        $('#email').val("");
        $('#user').val("");
        $('#inlineFormCheck').prop("checked",true);
    })
})