<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<div class="container">
	<div class="row" style="margin-top:50px;">
		<div class="col-md-offset-2 col-md-6">
			
			<div class="panel panel-primary">
	          <h4 style="margin-left: 15px;margin-top: 50px;">User Details</h4>

				<div class="panel-body">
					<form class="form-horizontal" method="POST">
						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8">
								<input type="text" name="name" class="form-control"
									placeholder="Username" required="required" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Contact</label>
							<div class="col-md-8">
								<input type="text" name="brand" class="form-control"
									placeholder="Contact Number" required="required" />
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-4">
								<input type="submit" name="submit" value="Save"
									class="btn btn-danger" />
							</div>
						</div>
					</form>

				</div>

			</div>

		</div>
		<div class="col-md-offset-2 col-md-6">


			<table class="table table-bordered" style="margin-left: 15px;margin-top: 50px;">
				<thead>
					<tr>
						<th>Firstname</th>
						<th>Mobile Number</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user">
						<tr class="">
							<td>${user.name}</td>
							<td>${user.number}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
        </div>
    </div>



</div>

