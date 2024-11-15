<%@ page language="java"
    pageEncoding="UTF-8"%>
<!-- Modal -->
	<form action="join" method="post">
		<div class="modal fade" id="exampleModal" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="exampleModalLabel">회원가입</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<div class="input-group mb-3">
							<span class="input-group-text" id="basic-addon1">ID</span> <input
								type="text" class="form-control" placeholder="Username"
								aria-label="Username" aria-describedby="basic-addon1" name="id">
						</div>
						<div class="input-group mb-3">
							<span class="input-group-text" id="basic-addon1">PASS</span> <input
								type="text" class="form-control" placeholder="Pass"
								aria-label="Username" aria-describedby="basic-addon1"
								name="pass">
						</div>
						<div class="input-group mb-3">
							<span class="input-group-text" id="basic-addon1">TEL</span> <input
								type="text" class="form-control" placeholder="tel"
								aria-label="Username" aria-describedby="basic-addon1" name="tel">
						</div>
						<div class="input-group mb-3">
							<span class="input-group-text" id="basic-addon1">EMAIL</span> <input
								type="text" class="form-control" placeholder="E-mail"
								aria-label="Username" aria-describedby="basic-addon1"
								name="email">
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-secondary"
							data-bs-dismiss="modal">Save</button>
						<button type="button" class="btn btn-primary"
							data-bs-dismiss="modal">Cancel</button>
					</div>
				</div>
			</div>
		</div>
	</form>
	<div>
		<!-- Modal -->
		<!-- Modal -->
		<div class="modal fade" id="loginModal" tabindex="-1"
			aria-labelledby="exampleModalLabel1" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="exampleModalLabel1">로그인</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">
					<form action="login" method="post">
						<div class="input-group mb-3">
							<span class="input-group-text" id="basic-addon1">ID</span> <input
								type="text" class="form-control" placeholder="Username"
								aria-label="Username" aria-describedby="basic-addon1" name="id">
						</div>
						<div class="input-group mb-3">
							<span class="input-group-text" id="basic-addon1">PASS</span> <input
								type="text" class="form-control" placeholder="Pass"
								aria-label="Username" aria-describedby="basic-addon1" name="pass">
						</div>
						<div class="modal-footer">
							<button type="submit" class="btn btn-secondary"
								data-bs-dismiss="modal">login</button>
							<button type="button" class="btn btn-primary "
								data-bs-dismiss="modal">Cancel</button>
						</div>
					</div>
					</form>
				</div>
			</div>
			<div>
				<!-- Modal -->