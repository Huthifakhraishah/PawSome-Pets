$(document).ready(function() {
	if($(".login").hasClass("slide-up")){
		$(".login").click(function(){
			$(this).removeClass("slide-up")
			$(".signup").addClass("slide-up")
		});
	}
    if($(".login").hasClass("slide-up")){
        $(".signup").click(function(){
            $(this).removeClass("slide-up")
            $(".login").addClass("slide-up")
        })}});